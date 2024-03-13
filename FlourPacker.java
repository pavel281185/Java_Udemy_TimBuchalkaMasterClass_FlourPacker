public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(goal < 0){
            return false;
        }
        if(bigCount * 5 + smallCount >=  goal && goal % 5 <= smallCount){
            return true;
        }
        return false;
    }
}
