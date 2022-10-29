public class AplikasiToDoList {

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static  String[] model = new String[10];
    public static void main(String[] args) {

        //testAddTodolist();
        //testAddTodolist();
        //testRemoveTodolist();
        //testInput();
        //testViewShowTodolist();
        //testViwAddTodolist();
        //testViewRemoveTodolist();

        viewShowTodolist();
    }

    /**
     * menampilkan todo list
     */
    public static void showTodolist(){
        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i+1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodolist(){
        model[0] = "Belajar java dasar 1";
        model[1] = "Belajar java dasar 2";
        model[2] = "Belajar java dasar 3";

        showTodolist();
    }

    /**
     * menambahkan todo list
     */
    public static void addTodolist(String todo){
        //cek apakah model penuh ?
        var penuh = true;
        for(int i = 0; i< model.length; i++){
            if(model[i]==null){
            // model masih ada yang kosong
            penuh = false;
            break;
            }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if(penuh){
            var temp = model;
            model = new  String[model.length*2];

            for(int i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        //tambahkan ke posisi yang data arraynya null
        for (var i = 0; i< model.length; i++){
            if(model[i]==null){
                model[i] = todo;
                break;
            }
        }

    }

    public static void testAddTodolist(){
        for(int i = 0; i < 25; i++){
            addTodolist("Contoh Todo ke. "+i);
        }

        showTodolist();
    }

    /**
     * menghapus todo list
     */
    public static boolean removeTodolist(Integer number){
        if((number-1)>= model.length){
            return false;
        } else if (model[number-1] == null){
            return false;
        }else {
            for (int i = (number-1); i < model.length; i++){
                if(i == (model.length-1)){
                    model[i]=null;
                }else {
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    // method testing remove
    public static void testRemoveTodolist(){
        addTodolist("satu");
        addTodolist("dua");
        addTodolist("tiga");
        addTodolist("empat");
        addTodolist("lima");

        var result=removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(7);
        System.out.println(result);

        result=removeTodolist(2);
        System.out.println(result);

        showTodolist();
    }

    // method input
    public static  String input(String info){
        System.out.print(info+ " : ");
        String data = scanner.nextLine();
        return data;
    }

    // method test input
    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi "+name);

        var channel = input("channel");
        System.out.println(channel);
    }

    /**
     * view todo list
     */
    public static void viewShowTodolist(){
        while (true){
            showTodolist();

            System.out.println("Menu");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");
            if(input.equals("1")){
                viewAddTodolist();
            }else if (input.equals("2")){
                viewRemoveTodolist();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    //test view show ToDoList
    public static void testViewShowTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");
        addTodolist("Empat");
        addTodolist("Lima");

        viewShowTodolist();
    }

    /**
     * view tambah todo list
     */
    public static void viewAddTodolist(){
        System.out.println("Menambah TODOLIST");

        var todo = input("Todo (x Jika Batal)");

        if (todo.equals("x")){
            //batal
        }else {
            addTodolist(todo);
        }
    }

    //test view add todo list
    public static void testViwAddTodolist(){
        addTodolist("satu");
        addTodolist("dua");

        viewAddTodolist();

        showTodolist();
    }

    /**
     * view hapus todo list
     */
    public static void viewRemoveTodolist(){
        System.out.println("Menghapus TODOLIST");

        showTodolist();

        var number = input("Nomor yang dihapus (x Jika Batal)");

        if(number.equals("x")){
            //batal
        }else {
            boolean success = removeTodolist(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus todolist : "+ number);
            }
        }
    }

    //test view Remove todo list
    public static void testViewRemoveTodolist(){
        addTodolist("Satu");
        addTodolist("Dua");
        addTodolist("Tiga");

        showTodolist();

        viewRemoveTodolist();

        showTodolist();
    }


}