public class revieweravgrating{
    public static void main(String[]args){
         int[][] textMatrix = {{ 8,8,8},
        {6,6,6},
        {1,5,10}};
        
        System.out.println(reviewerAvgRating(textMatrix,2));
        
        
    }
    public static int reviewerAvgRating(int[][] ratings, int reviewer){
        double sum = 0;
        for(int i = 0; i< ratings.length; i++){
            sum += ratings[reviewer][i];
        }
        return (int) sum/ratings.length;
        
        
    }
}