
public class avgrating{
    public static void main(String[]args){
        int[][] textMatrix = {{ 8,8,8},
        {6,6,6},
        {1,5,10}};
        
        System.out.println(movieAvgRating(textMatrix,2));
        
        
    }
    public static int movieAvgRating(int[][] ratings, int movie){
        double sum = 0;
        for(int i = 0; i< ratings.length; i++){
            sum += ratings[i][movie];
        }
        return (int) sum/ratings.length;
        
        
    }
}