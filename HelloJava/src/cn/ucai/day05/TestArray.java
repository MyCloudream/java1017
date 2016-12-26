package cn.ucai.day05;

/**
 * 数组：数据的容器
 */
public class TestArray {
	public static void main(String[] args) {
		// 数组的定义
		int[] scoreArr = new int[7];
		// 数组元素的初始化
		scoreArr[0] = 98;
		scoreArr[1] = 89;
		scoreArr[2] = 92;
		scoreArr[3] = 67;
		scoreArr[4] = 40;
		scoreArr[5] = 49;
		scoreArr[6] = 62;
		
		for(int i=0;i<scoreArr.length;i++){// 硬编码（写死了）hard coding
			System.out.println(i);
			if(scoreArr[i]>=60){
				System.out.println("及格");
			}
		}
	}
}
