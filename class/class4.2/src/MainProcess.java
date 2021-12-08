public class MainProcess {
    public static void main(String[] args) {
        int size = 10;
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*20);
        }

        AdvancedArray aa = new AdvancedArray();

        //设置数组
        System.out.println("原始数组:");
        aa.setArray(array);
        aa.printArray();

        //排序数组
        System.out.println("排序后数组:");
        aa.quickSort(0,aa.myList.length-1);
        aa.printArray();

        //二分法查找数组元素key
        int key = (int)(Math.random()*20);
        System.out.printf("元素%d的位置是: %d%n",key, aa.binarySearch(key));

        //找最大最小值
        System.out.printf("最大数: %d%n", aa.getMaxValue());
        System.out.printf("最小数: %d%n", aa.getMinValue());

        //混排数组
        aa.shuffle(100);
        System.out.println("混排后的数组:");
        aa.printArray();

        //移动数组
        int offset = (int)(Math.random()*aa.myList.length);
        String direction = "left";
        aa.move(direction, offset);
        System.out.printf("向%s移动%d位后的数组：%n", direction,offset);
        aa.printArray();

        offset = (int)(Math.random()*aa.myList.length);
        direction = "right";
        aa.move(direction, offset);
        System.out.printf("向%s移动%d位后的数组：%n", direction,offset);
        aa.printArray();

        //插入数据
        key = (int)(Math.random()*20);
        int index = (int)(Math.random()*aa.myList.length);
        aa.insert(index,key);
        System.out.printf("在下标%d位置插入数据%d后的数组：%n", index, key);
        aa.printArray();

    }
}
