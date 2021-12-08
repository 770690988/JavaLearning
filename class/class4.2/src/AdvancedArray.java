import java.util.Objects;

public class AdvancedArray extends BasicArray implements BasicArrayOperation, AdvancedArrayOperation{

    @Override
    public void setArray(int[] array) {
        myList = array;
    }

    public int getMaxValue() {
        int maxValue = 0;
        for (int i = 0; i < myList.length; i++) {
            if (maxValue < myList[i]){
                maxValue = myList[i];
            }
        }
        return maxValue;
    }

    @Override
    public int getMinValue() {
        int maxValue = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (maxValue > myList[i]){
                maxValue = myList[i];
            }
        }
        return maxValue;
    }

    @Override
    public void insert(int index, int key) {
        myList[index] = key;
    }

    @Override
    public void move(String direction, int offset) {
        int [] array = new int[10];
        System.arraycopy(myList, 0, array, 0, myList.length);
        if (Objects.equals(direction, "left")){
            for (int i = 0; i < myList.length; i++) {

                myList[i] = array[(i + offset) % myList.length];
            }
        }else if(Objects.equals(direction, "right")){
            for (int i = 0; i < myList.length; i++) {
                myList[i] = array[(i+ myList.length - offset) % myList.length];
            }
        }
    }

    @Override
    public void printArray() {
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i]+" ");
        }
        System.out.println();
    }

    @Override
    public int binarySearch(int key) {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] == key){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void quickSort(int left, int right) {
        int head = left;
        int tail = right;
        while (head < tail) {
            while (head < tail) {
                if (myList[left] <= myList[tail]) {
                    tail--;
                } else {
                    break;
                }
            }
            while (head < tail) {
                if (myList[left] >= myList[head]) {
                    head++;
                } else {
                    break;
                }
            }
            if (head < tail) {
                int temp;
                temp = myList[head];
                myList[head] = myList[tail];
                myList[tail] = temp;
            } else if (head == tail) {
                int temp;
                temp = myList[head];
                myList[head] = myList[left];
                myList[left] = temp;
                quickSort(left, head - 1);
                quickSort(head + 1, right);
                break;

            } else {
                System.out.println("发生错误");
            }
        }
    }

    @Override
    public void shuffle(int num) {
        for (int i = 0; i < num; i++) {
            int first = (int)(Math.random()*10);
            int second = (int)(Math.random()*10);
            int temp = myList[first];
            myList[first] = myList[second];
            myList[second] = temp;
        }
    }
}
