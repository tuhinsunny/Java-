public class loops {
    public static void main(String[] args) {
        // While Loop
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        // Do-While Loop
        int j = 0;
        do{
            System.out.println(j);
            j++;
        } while(j<5);

        // For Loop
        for(int k=0; k<5; k++){
            System.out.println(k);
        }

        // Nested For Loop
        for(int l=0; l<3; l++){
            for(int m=0; m<3; m++){
                System.out.println(l + " " + m);
            }
        }

        // Break Statement -> Exits the loop
        for(int n=0; n<5; n++){
            if(n==2){
                break;
            }
            System.out.println(n);
        }

        // Continue Statement -> Skips the current iteration
        for(int o=0; o<5; o++){
            if(o==2){
                continue;
            }
            System.out.println(o);
        }
    }
}
