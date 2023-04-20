public class S2 { 
    public static void main(String[] args) {
     //        Основание 12 в степень 7, результат равен
              
          print_string("Основание 12, стапень 7, результат равен");}
       
            private static void print_string(String s) {
        
                String[] m1 = s.split(", ");
                String[] m1_1 = m1[0].split(" ");
                String[] m1_2 = m1[1].split(" ");
        
                String a = m1_1[1];
                Integer a_int = Integer.parseInt(a);
                String b = m1_2[1];
                Integer b_int = Integer.parseInt(b);
                Double result = Math.pow(a_int, b_int);
                System.out.println("Основание " + a + ", стапень " + b + ", результат равен " + Math.round(result));

              
        
            }
        }
           // String a="Hello";
            //long begin = System.currentTimeMillis();
            
            //for (int i=0;i<30000;i++){
            //a += Character.getName(i);
            
            
            //long end = System.currentTimeMillis();
            //System.out.println(end - begin);
            
            //StringBuilder builder = new StringBuilder("Hello World");
            
            //begin = System.currentTimeMillis();
            //for (int i=0;i<30000;i++) {
            //builder.append(Character.getName(i));
           
            // end = System.currentTimeMillis();
            //System.out.println(end - begin);
            
            