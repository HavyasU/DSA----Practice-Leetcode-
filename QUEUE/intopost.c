
struct stack
{
    int top;
    int items[];
};

char infix[100];
char postfix[100];

void convert()
{
    for (int i = 0; i < postfix[i] != '\0'; i++)
    {
        char symb = infix[i];

        switch ((symb))
        {
        case '(':
            push(symb);
            break;
        case ')':
            while ((temp = pop()) != '(')
            {
                postfix[pos++] = temp;
            }
            break;
        case '+':
        case '-':
        case '*':
        case '/':
        case '$':
            while (!empty() && prcedence(s.top) >= precedence(symb))
                postfix[pos++] = pop();
            push(symb);

        default:
            postfix[pos++] = symb
        }
    }
}
