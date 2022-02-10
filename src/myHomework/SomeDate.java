package myHomework; // знаю, что не работает, запуталась конкретно

public class SomeDate {
    private int[] someDate = new int[5];
    private int nextIndex = 0;

    public void add(int num) {
        if (nextIndex < someDate.length) {
            someDate[nextIndex] = num;
            nextIndex++;
        } else if (nextIndex > someDate.length) {
            for (int i = 3; i < someDate.length; i--) {
                someDate[i] = someDate[i - 1];
            }
            someDate[someDate.length - 1] = num;
        }
    }

    public int averegeOfsomeDate() {
        int sum = 0;
        int index_count = 0;
        for (int i = 0; i < someDate.length; i++) {
            sum =+ someDate [i];
            index_count++;
        }
        int averegeOfsomeDate = sum/index_count;
        return averegeOfsomeDate;
    }
}
