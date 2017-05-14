    class MyBook extends Book{
        int price;
        MyBook(String title,String author, int pri){
            super(title,author);
            price = pri;
        }
        public void display(){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("Price: "+price);
        }
    }
