package Temp;

public class temp02 {

	public static void main(String[] args) {


String in = "Паблито, а профит-то в чём, если нужно получить количество конкретного символа, то ничего шустрее тупого перебора с проверкой не придумать.";
String c = "п"; // букву, которую надо посчитать
long time = System.currentTimeMillis();
int len = in.length();
int newlen = in.replaceAll(c, "").length();
time = System.currentTimeMillis() - time;
System.out.println("всего букв - " + (len - newlen) + " " + time + "ms");
 
char ch = 'п';
len = 0;
time = System.currentTimeMillis();
for (char curr : in.toCharArray()) {
    if (ch == curr) {
        len++;
    }
}
time = System.currentTimeMillis() - time;
System.out.println("всего букв - " + len + " " + time + "ms");

	}

}
