import java.util.Scanner;


public class MainProgram {

	
	public static void main(String[] args) {
		class Rectangle {
			double width;
			double height;
			double x;
			double y;

			double computeArea() {
				double area = width * height;
				return area;
			}
		}

		public static void main (String[]args){
			// TODO Auto-generated method stub
			Rectangle rectA = new Rectangle();
			Rectangle rectB = new Rectangle();
			Scanner scanner = new Scanner(System.in);
			System.out.println("输入矩形a的宽度：");
			rectA.width = scanner.nextDouble();
			System.out.println("输入矩形a的高度：");
			rectA.height = scanner.nextDouble();
			System.out.println("输入矩形a的横坐标：");
			rectA.x = scanner.nextDouble();
			System.out.println("输入矩形a的纵坐标：");
			rectA.y = scanner.nextDouble();
			System.out.println("输入矩形b的宽度：");
			rectB.width = scanner.nextDouble();
			System.out.println("输入矩形b的高度：");
			rectB.height = scanner.nextDouble();
			System.out.println("输入矩形b的横坐标：");
			rectB.x = scanner.nextDouble();
			System.out.println("输入矩形b的纵坐标：");
			rectB.y = scanner.nextDouble();
			double area1 = rectA.width * rectA.height;
			double area2 = rectB.width * rectB.height;
			System.out.println("rectA的面积:" + area1);
			System.out.println("rectB的面积：" + area2);
			if (rectA.x <= rectB.x && rectA.y <= rectB.y) {
				if (rectA.y + rectA.height >= rectB.y || rectA.x + rectA.width >= rectB.x) {
					System.out.println("a和b相交");
				}
			} else if (rectA.x < rectB.x && rectA.y > rectB.y) {
				if (rectB.y + rectB.height >= rectA.y || rectA.x + rectA.width >= rectB.x) {
					System.out.println("a和b相交");
				}
			}
			if (rectA.x > rectB.x && rectA.y < rectB.y) {
				if (rectA.y + rectA.height >= rectB.y || rectB.x + rectB.width >= rectA.x) {
					System.out.println("a和b相交");
				}
			}
			if (rectA.x > rectB.x && rectA.y > rectB.y) {
				if (rectB.y + rectB.height >= rectA.y || rectB.x + rectB.width >= rectA.x) {
					System.out.println("a和b相交");
				}
			}
		}
	}
}

