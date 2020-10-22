package com.company.LAB_4;

public class Expression_ver {
    public String expression;
    public String parenthesses = "";
    public int openP = 0;
    public int closedP = 0;
    public boolean valid = true;

    public Expression_ver(String expression) {
        this.expression = expression;
    }

    public void Remove_num_signs() {
        for (char i : expression.toCharArray()) {

            if (i == '(') {
                openP++;
                parenthesses += i;
            }
            if (i == ')') {
                closedP++;
                parenthesses += i;
            }
        }
    }

    public void check_P_valid() {
        if (openP == closedP) {
            int c = 0;
            int o = 0;
            for (char i : parenthesses.toCharArray()) {
                if (i == ')') c++;
                if (i == '(') o++;
                if (o < c) valid = false;
            }
        } else valid = false;
    }
}
