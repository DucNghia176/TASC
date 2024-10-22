package AssignmentJavaCore.Assignment;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final CustomerManager manager = new CustomerManager();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Quản Lý Khách Hàng ---");
            System.out.println("1. Xem danh sách khách hàng");
            System.out.println("2. Thêm khách hàng mới");
            System.out.println("3. Tìm kiếm khách hàng theo số điện thoại");
            System.out.println("4. Chỉnh sửa thông tin khách hàng");
            System.out.println("5. Xóa khách hàng");
            System.out.println("6. Thoát");
            System.out.print("Chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> manager.displayAllCustomers();
                case 2 -> addCustomer();
                case 3 -> findCustomer();
                case 4 -> updateCustomer();
                case 5 -> deleteCustomer();
                case 6 -> System.exit(0);
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine().trim();
        String email = inputValidEmail().trim();
        String phoneNumber = inputValidPhoneNumber().trim();

        Customer customer = new Customer(name, email, phoneNumber);
        manager.addC(customer);
        manager.saveC();
        System.out.println("Thêm thành công");
    }

    private static String inputValidPhoneNumber() {
        String phone;
        while (true) {
            System.out.print("Nhập số điện thoại (10 số): ");
            phone = scanner.nextLine().trim();
            if (phone.matches("^\\d{10}$")) {
                if (!manager.phoneExists(phone)) {
                    break;
                } else {
                    System.out.println("Số điện thoại đã tồn tại. Vui lòng nhập lại.");
                }
            } else {
                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
            }
        }
        return phone;
    }

    private static String inputValidEmail() {
        String email;
        while (true) {
            System.out.print("Nhập email: ");
            email = scanner.nextLine().trim();
            if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                break;
            } else {
                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        }
        return email;
    }

    private static void findCustomer() {
        System.out.print("Nhập số điện thoại cần tìm: ");
        String phone = scanner.nextLine().trim();
        Customer customer = manager.searchByPhone(phone);
        if (customer != null) {
            System.out.println("Khách hàng tìm thấy: " + customer);
        } else {
            System.out.println("Không tìm thấy khách hàng.");
        }
    }

    private static void updateCustomer() {
        System.out.print("Nhập số điện thoại cần sửa: ");
        String phone = scanner.nextLine().trim();
        Customer customer = manager.searchByPhone(phone);

        if (customer != null) {
            System.out.print("Nhập tên mới (hoặc bỏ trống để giữ nguyên): ");
            String newName = scanner.nextLine().trim();
            System.out.print("Nhập email mới (hoặc bỏ trống để giữ nguyên): ");
            String newEmail = scanner.nextLine().trim();
            System.out.print("Nhập số điện thoại mới (hoặc bỏ trống để giữ nguyên): ");
            String newPhone = scanner.nextLine().trim();

            manager.edit(customer, newName.isEmpty() ? null : newName, newEmail.isEmpty() ? null : newEmail, newPhone.isEmpty() ? null : newPhone);
            manager.saveC(); // Lưu lại vào file
            System.out.println("Cập nhật thông tin thành công!");
        } else {
            System.out.println("Không tìm thấy khách hàng.");
        }
    }

    private static void deleteCustomer() {
        System.out.print("Nhập số điện thoại cần xóa: ");
        String phone = scanner.nextLine().trim();
        if (manager.deleteC(phone)) {
            manager.saveC(); // Cập nhật lại file sau khi xóa
            System.out.println("Xóa thành công khách hàng với số điện thoại: " + phone);
        } else {
            System.out.println("Không tìm thấy khách hàng với số điện thoại: " + phone);
        }
    }
}
