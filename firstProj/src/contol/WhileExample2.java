package contol;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String age ="20";
		String phone = "010-1010-1010";
		Scanner scn = new Scanner(System.in);
		while(true ) {
			System.out.println("�޴��� ����");
			System.out.println("1�̸�2����3����ó4����");
			int menu = scn.nextInt();
			if (menu==1) {
				System.out.println("�̸�:"+name);
			}else if (menu == 2) {
					System.out.println("����:"+age);
				}else if (menu == 3) {
						System.out.println("����ó:"+phone);
					}else if (menu==4) {
							break;
						}
					}
				}
	
			
			}

