package com.ohgiraffers.section01.practice;

public class Student {


        private String name;
        private int score;

        // 생성자
        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // 점수를 출력하는 메소드
        public void displayInfo() {
            System.out.println("이름: " + name + ", 점수: " + score);
        }

        // 점수 getter
        public int getScore() {
            return score;
        }


}
