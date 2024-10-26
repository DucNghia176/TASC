package AssignmentJavaCore.Assignment;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CustomerManager {
    private static final String FILE_NAME = "assignment.txt";
    private final Map<String, Customer> customers;

    public CustomerManager() {
        customers = new LinkedHashMap<>();
        loadCustomers();
    }

    // Tải thông tin từ file
    private void loadCustomers() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Tách thông tin theo dấu phẩy
                if (data.length == 3) {
                    String name = data[0];
                    String email = data[1];
                    String phone = data[2];
                    customers.put(phone, new Customer(name, email, phone)); // thêm khách hàng
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại. Một file mới sẽ được tạo khi lưu dữ liệu.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    // Lưu danh sách vào file
    public void saveCustomers() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Customer customer : customers.values()) {
                bw.write(customer.getName() + "," + customer.getEmail() + "," + customer.getPhone());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi vào file: " + e.getMessage());
        }
    }

    // Thêm khách hàng
    public void addCustomer(Customer customer) {
        if (phoneExists(customer.getPhone())) {
            System.out.println("Số điện thoại đã tồn tại.");
        } else {
            customers.put(customer.getPhone(), customer);
        }
    }

    // Tìm kiếm khách hàng theo số điện thoại
    public Customer searchByPhone(String phone) {
        return customers.get(phone);
    }

    // Chỉnh sửa thông tin khách hàng
    public void editCustomer(Customer customer, String newName, String newEmail, String newPhone) {
        if (newName != null && !newName.isEmpty()) {
            customer.setName(newName);
        }
        if (newEmail != null && !newEmail.isEmpty()) {
            customer.setEmail(newEmail);
        }
        if (newPhone != null && !newPhone.isEmpty()) {
            // Kiểm tra số điện thoại mới không trùng lặp
            if (!newPhone.equals(customer.getPhone()) && !customers.containsKey(newPhone)) {
                // Xóa khách hàng hiện tại với số điện thoại cũ
                customers.remove(customer.getPhone());
                // Cập nhật số điện thoại mới
                customer.setPhone(newPhone);
                // Thêm lại khách hàng với số điện thoại mới
                customers.put(newPhone, customer);
            } else {
                System.out.println("Số điện thoại mới đã tồn tại hoặc giống số hiện tại.");
            }
        }
    }

    // Xóa khách hàng theo số điện thoại
    public boolean deleteCustomer(String phone) {
        return customers.remove(phone) != null;
    }

    // Kiểm tra xem số điện thoại đã tồn tại chưa
    public boolean phoneExists(String phone) {
        return customers.containsKey(phone);
    }

    // Hiển thị tất cả khách hàng
    public void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("Danh sách khách hàng trống.");
        } else {
            customers.values().forEach(System.out::println);
        }
    }
}
