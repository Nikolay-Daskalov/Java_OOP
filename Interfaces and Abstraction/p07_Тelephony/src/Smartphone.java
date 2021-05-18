import java.util.List;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String url : this.urls) {
            boolean ifContainsNumber = false;
            for (char c : url.toCharArray()) {
                if (Character.isDigit(c)) {
                    ifContainsNumber = true;
                    break;
                }
            }
            if (ifContainsNumber) {
                stringBuilder.append("Invalid URL!\n");
            } else {
                stringBuilder.append("Browsing: " + url + "!\n");
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public String call() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String number : this.numbers) {
            boolean ifContainsChar = false;
            for (char c : number.toCharArray()) {
                if (!Character.isDigit(c)) {
                    ifContainsChar = true;
                    break;
                }
            }

            if (!ifContainsChar) {
                stringBuilder.append("Calling... " + number + "\n");
            } else {
                stringBuilder.append("Invalid number!\n");
            }
        }
        return stringBuilder.toString();
    }
}