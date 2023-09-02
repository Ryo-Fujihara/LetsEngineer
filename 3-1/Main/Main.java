/*
 *バブルソート
 *チェックテスト-Java3章
 */

 public class Main {
    public static void main (String [] args){

        /*問1
         * int型の配列 data を作成し、値を 3,1,2,7,5 で初期化しなさい
         */

         int [] data = {3,1,2,7,5} ;

        /*
         * 問2
         * 以下のfor文を完成させなさい
         */

         for (int i = 0; i < 5 ; i++){
            System.out.print(data[i] + " ");
         }
         System.out.println();

          for ( int i =0; i < 4; i++){
  
            for ( int j = 4; j>i; j--){

                /*
                 * 問3
                 * 以下、配列の添字を入れてソートを完成させなさい
                 * なぜ退避用の変数boxが必要なのか？
                 */

                 if (data [i] > data [j]){
                    int box = data [i];
                    data[i] = data [j];
                    data[j] = box;
                 }
            }
          }
            for (int i=0; i < data.length; i++){
                System.out.print(data[i] + " ");
            }
        
    }
 }