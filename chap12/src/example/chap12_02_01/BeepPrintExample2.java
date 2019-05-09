package example.chap12_02_01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
//		thread.start();

//		Thread thread = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				Toolkit tk = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					tk.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//
//					}
//				}
//
//			}
//
//		});

		Thread thread = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}

		});

		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò");
			try {
				thread.sleep(500);
			} catch (Exception e) {

			}
			System.out.println(thread.getName());
		}

	}

}
