
import java.sql.SQLOutput;
import java.util.Scanner;
    public class Showroom implements Utility {
        String showroom_name;
        String showroom_address;
        int total_employees;
        int total_cars_in_stock;
        String manager_name;

        public String getShowroom_name() {
            return showroom_name;
        }

        public void setShowroom_name(String showroom_name) {
            this.showroom_name = showroom_name;
        }

        public String getShowroom_address() {
            return showroom_address;
        }

        public void setShowroom_address(String showroom_address) {
            this.showroom_address = showroom_address;
        }

        public int getTotal_employees() {
            return total_employees;
        }

        public void setTotal_employees(int total_employees) {
            this.total_employees = total_employees;
        }

        public int getTotal_cars_in_stock() {
            return total_cars_in_stock;
        }

        public void setTotal_cars_in_stock(int total_cars_in_stock) {
            this.total_cars_in_stock = total_cars_in_stock;
        }

        public String getManager_name() {
            return manager_name;
        }

        public void setManager_name(String manager_name) {
            this.manager_name = manager_name;
        }

        @Override
        public void get_details() {
            System.out.println("Showroom Name: "+showroom_name);
            System.out.println("Showroom Address: "+showroom_address);
            System.out.println("Manager Name: "+manager_name);
            System.out.println("Total Employees: "+total_employees);
            System.out.println("Total Cars In Stock: "+total_cars_in_stock);

        }
        @Override
        public void set_details(){
            Scanner sc = new Scanner(System.in);
            System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
            System.out.println();
            System.out.print("SHOWROOM NAME: ");
            showroom_name = sc.nextLine();
            System.out.print(("SHOWROOM ADDRESS: "));
            showroom_address = sc.nextLine();
            System.out.print("MANAGER NAME: ");
            manager_name = sc.nextLine();
            System.out.print("TOTAL NO OF EMPLOYEES: ");
            total_employees = sc.nextInt();
            System.out.print("TOTAL CARS IN STOCK: ");
            total_cars_in_stock = sc.nextInt();

        }

}
