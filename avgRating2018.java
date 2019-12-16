public class avgRating2018{
    public static void main(String[]args){
        int[][] textMatrix = {{ 8,8,8},
        {6,6,6},
        {1,5,10}};
        
        System.out.println(avgRating2018(textMatrix));
        
    }
    public static int avgRating2018(int[][] ratings){
        int sum = 0;
        int row = ratings.length;
        int col = ratings[0].length;
        for(int i = 0; i< ratings.length; i++){
            for(int j = 0; j< ratings[0].length; j++){
                sum += ratings[i][j];
            }
        }
        return sum/(row*col);
        
        
    }
}