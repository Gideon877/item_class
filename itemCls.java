import java.util.*;




public class itemCls
{
    private String name;
    // private nameArray[] names;
    private double price;
    private int qoh;
    // Create an empty object
    public itemCls(String name, double price, int qoh) {
        name = "XXXXXXXXXX";
        price = 0;
        qoh = 0;
    }
    public void setName(String inName){
            this.name = inName;
        }

    public void setPrice(double inPrice){
            this.price = inPrice;
        }

    public void setQOH(int inQOH){
            this.qoh = inQOH;
        }

    public void getName(String inName){
            // return name;
        }

    public void getPrice(double inPrice){
            // return inPrice;
        }

    public void getQOH(int inQOH){
            // return inQOH;
        }

    public void displayDetails(){
            // for(int i=0;i<nameArray;i++){
            //     nameArray[i].displayDetails();
            // }
        }

    public void buyItem(int inQty){
    }

    public static void main(String[] rgs)
    {
        String name;
        int qOH, option;
        double price;

        menu();
        Scanner keyboard = new Scanner(System.in); /**Allow the keyboard to accept the keyborad input */
        option = keyboard.nextInt();


        /**
        create a method for option 1;
            display what option was chosen : An item is created.
            request values ;
                String ctName;
                int ctPrice, ctQOH;
                validate ctPrice to be > 0 and ctQOH to be >= 0
                save input into an object

        create a method for option 2;
            display what option was chosen: An item is edited.
            display a sub-menu using displaySubmenu
                1) Name is edited
                    - input new ctName value in the object
                2) Price is edited
                    - input new ctPrice value in the object
                3) Quantity on Hand is edited
                    - input new ctQOH value in the object
                4) RETURN TO MAIN MENU

        create a method for option 3;
            display what option was chosen: An item is diplayed.
            display all details of all the items


        */
        // while (option <= 0 || option > 5) {
        //     System.out.println("Not a valid choice!\nPlease try again...\n");
        //     System.out.println ( "1) Option 1: An item is created\n2) Option 2: An item is edited\n3) Option 3: An item is diplayed\n4) Option 4: An item is bought\n5) Option 5: EXIT" );
        //     System.out.print("Select option: ");
        //     option = keyboard.nextInt();
        // }

        menu();
        // System.out.println(option);
        while (option != 5) {

            if (option == 1) {
                System.out.println("An item is created.\n");
                String ctName;
                int ctPrice, ctQOH;

                System.out.print("Enter Name: ");
                ctName = keyboard.next();

                System.out.print("Enter Price: ");
                ctPrice =  keyboard.nextInt();
                System.out.print("Enter Quantity on Hand: ");
                ctQOH = keyboard.nextInt();
            }
            else if (option == 2) {
                sub_menu();
                int choice = keyboard.nextInt();

            }
            else if (option == 3) {
                System.out.println("You chose: " + option);
            }
            else if (option == 4) {
                System.out.println("You chose: " + option);
            }

            else if (option == 5) {
                System.out.println("Goodbye!!");
                break;
            }
            else if (option !=5) {
				System.out.println("Sorry, that was an invalid menu choice, try again.");
	    	}

            menu();
            option = keyboard.nextInt();
        }

    }

    public static void menu(){
        System.out.println( "1) Option 1: An item is created\n2) Option 2: An item is edited\n3) Option 3: An item is diplayed\n4) Option 4: An item is bought\n5) Option 5: EXIT" );
        System.out.print("Select option: ");

    }

    public static void sub_menu(){
        System.out.println("------- An item is edited. -------");
        System.out.println("1) Name is edited\n2) Price is edited\n3) Quantity on Hand is edited\n4) RETURN TO MAIN MENU");
    }
}
