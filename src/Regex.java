import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class Regex {
        public static void main(String[] args) {
// первый синтаксис применения regex
            String schools = "Name: Hillel, City: Odessa; Name: Stanford, City: Stanford";
            System.out.println(schools.matches(".*__.*")); // печатаем true / false если регульрное выражение совпадаетс со строкой
            System.out.println(schools.replaceAll("Name: ([^,]+)", "Name: *$1*"));// печатаем новую строку с заменой
            System.out.println(schools);

            String text = "Hello, my name is\n Robert. I am a programmer.";
            String betterText = text.toLowerCase().replaceAll("[.,!?;:]", "");
            System.out.println(betterText);
            String[] words = betterText.split("\\s+"); // разбиваем строку по пробелам
            for (String w : words) {                    // выводим данные новой строки
                System.out.println(w);
            }

// второе применение regex в Java:
            String phoneNumber = "+380975156900";
            Pattern myRegex = Pattern.compile(".{3}(.{3})");    // устанавливаем патерн (шаблон для строки)
            Matcher m = myRegex.matcher(phoneNumber);           // применяем regex к строке телефона
            if (m.find()) {                                     //  если совпадает то выводим на экран
                System.out.println(m.group());
            } else {
                System.out.println("No carrier code in phone number.");
            }

        }
    }

