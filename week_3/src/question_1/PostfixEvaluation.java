package question_1;

import java.util.Stack;

public class PostfixEvaluation {

	static int evalPostfix(String expression) {
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			if (Character.isDigit(ch))
				st.push(ch - '0');

			else {
				int value1 = st.pop();
				int value2 = st.pop();
				switch (ch) {
				case '+' -> st.push(value2 + value1);
				case '-' -> st.push(value2 - value1);
				case '*' -> st.push(value2 * value1);
				case '/' -> st.push(value2 / value1);
				}
			}
		}
		return st.pop();
	}

}