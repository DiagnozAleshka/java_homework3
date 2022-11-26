import java.util.ArrayList;

/*  Пусть дан произвольный список целых чисел, удалить из него четные числа */
 public class program {
    
        public static void main(String[] args) {
            ArrayList<Integer>list1=new ArrayList<>();
            list1.add(1);
            list1.add(3);
            list1.add(2);
            list1.add(6);
            list1.add(12);
            list1.add(7);
            System.out.println(list1);
            int i = 0;
            while (i<list1.size()){
                if (list1.get(i) %2 ==0){
                    list1.remove(i);
                }
                else{
                    i++;
                }
            }
            System.out.println(list1);
        }
        
          
    }
 