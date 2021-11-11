public class Exercise2 {
    public static void main(String[] args) {
        outputArr();
    }

    private static void outputArr() {
        String[] arr = {"Roman","Aleksandr","Sergey","Pavel","Ilya"};

        System.out.println(arr.length);

        for(String el:arr){
            System.out.println(el);
        }
    }
}
