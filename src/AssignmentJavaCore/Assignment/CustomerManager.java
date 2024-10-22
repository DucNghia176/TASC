package AssignmentJavaCore.Assignment;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private static final String FILE_NAME = "assignment.txt"; // Sửa tên tệp
    private final Map<String, Customer> customers;

    public CustomerManager() {
        customers = new HashMap<>();
        loadC();
    }

    // Tải thông tin từ file
    private void loadC() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); // Tách thông tin theo dấu phẩy
                if (data.length == 3) {
                    customers.put(data[2].trim(), new Customer(data[0].trim(), data[1].trim(), data[2].trim())); // thêm khách hàng
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại. Một file mới sẽ được tạo khi lưu dữ liệu.");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    // Lưu danh sách vào file
    public void saveC() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Customer customer : customers.values()) {
                bw.write(customer.getName() + "," + customer.getEmail() + "," + customer.getPhone());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi vào file: " + e.getMessage());
        }
    }

    // Thêm vào danh sách
    public void addC(Customer customer) {
        this.customers.put(customer.getPhone(), customer);
    }

    // Tìm kiếm
    public Customer searchByPhone(String phone) {
        return customers.get(phone);
    }

    // Chỉnh sửa
    public void edit(Customer customer, String newName, String newEmail, String newPhone) {
        if (newName != null && !newName.isEmpty()) {
            customer.setName(newName);
        }
        if (newEmail != null && !newEmail.isEmpty()) {
            customer.setEmail(newEmail);
        }
        if (newPhone != null && !newPhone.isEmpty()) {
            // Kiểm tra số điện thoại mới không bị trùng
            if (!this.customers.containsKey(newPhone)) {
                customer.setPhone(newPhone);
            } else {
                System.out.println("Số điện thoại mới đã tồn tại.");
            }
        }
    }

    // Xóa theo số điện thoại
    public boolean deleteC(String phone) {
        return customers.remove(phone) != null; // Trả về true nếu xóa thành công
    }

    // Kiểm tra xem số điện thoại đã tồn tại chưa
    public boolean phoneExists(String phone) {
        return customers.containsKey(phone);
    }

    // Hiện thị khách hàng
    public void displayAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("Danh sách khách hàng trống.");
        } else {
            customers.values().forEach(System.out::println);
        }
    }
}
