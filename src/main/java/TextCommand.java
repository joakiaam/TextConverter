public interface TextCommand {
  default String execute(String text) {
    return text;
  }
}