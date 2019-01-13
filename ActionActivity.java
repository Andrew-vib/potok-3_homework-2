import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ActionActivity {

    static public void main (String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Необходимые действия при работе с телефоном");
        System.out.println("1 - первый запуск приложения");
        System.out.println("2 - нажатие кнопки \"Домой\"");
        System.out.println("3 - возврат в приложение");
        System.out.println("4 - нажатие кнопки \"Назад\"");
        System.out.println("5 - смена ориентации экрана");
        System.out.println("-1 - Выход из программы");

        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) break;

            if (a == 1)onCreate();
            else if (a == 2)  buttonHome();
            else if (a == 3)  backToApplication();
            else if (a == 4)  buttonBack();
            else if (a == 5)changeOrientation();
            else if (a < -1 || a >6 ) error();
        }
     }

     static void onCreate() throws InterruptedException {
         System.out.println("Первый запуск приложения");
         Thread.sleep(1000);
         System.out.println("OnCreate");
         Thread.sleep(1000);
         System.out.println("onStart");
         Thread.sleep(1000);
         System.out.println("onResume");
     }
     
     static void buttonHome() throws InterruptedException {
         System.out.println("Нажатие кнопки \"Домой\"");
         Thread.sleep(1000);
         System.out.println("OnCreate");
         Thread.sleep(1000);
         System.out.println("onStart");
         Thread.sleep(1000);
         System.out.println("onResume");
     }

    static void backToApplication() throws InterruptedException {
        System.out.println("Возврат в приложение");
        Thread.sleep(1000);
        System.out.println("OnRestart");
        Thread.sleep(1000);
        System.out.println("onStart");
        Thread.sleep(1000);
        System.out.println("onResume");
    }

    static void buttonBack() throws InterruptedException {
        System.out.println("Нажатие кнопки \"Назад\"");
        Thread.sleep(1000);
        System.out.println("OnPause");
        Thread.sleep(1000);
        System.out.println("onStop");
        Thread.sleep(1000);
        System.out.println("onDestroy");
    }

    static void changeOrientation() throws InterruptedException {
        System.out.println("Смена ориентации");
        Thread.sleep(1000);
        System.out.println("onPause");
        Thread.sleep(1000);
        System.out.println("onSaveInstanceState");
        Thread.sleep(1000);
        System.out.println("onStop");
        Thread.sleep(1000);
        System.out.println("onDestroy");
        Thread.sleep(1000);
        System.out.println("onCreate");
        Thread.sleep(1000);
        System.out.println("onStart");
        Thread.sleep(1000);
        System.out.println("onRestoreInstanceState");
        Thread.sleep(1000);
        System.out.println("onResume");
    }

    static void error(){
        System.out.println("Вы ввели значение, которые не соответствует значениям меню");
    }
}
