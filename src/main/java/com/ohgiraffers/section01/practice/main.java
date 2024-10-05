package com.ohgiraffers.section01.practice;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5]; // 최대 5명의 학생
        int count = 0; // 현재 저장된 학생 수

        while (count < 5) {
            System.out.println("학생 정보를 입력하세요 (이름, 점수):");
            System.out.print("이름: ");
            String name = sc.nextLine();

            int score;
            while (true) {
                System.out.print("점수: ");
                score = sc.nextInt();
                if (score >= 0) {
                    break; // 유효한 점수인 경우
                }
                System.out.println("점수는 0 이상이어야 합니다. 다시 입력하세요.");
            }
            sc.nextLine(); // 개행 문자 제거

            students[count] = new Student(name, score);
            count++;
        }

        // 학생 목록 출력
        System.out.println("\n학생 목록:");
        for (int i = 0; i < count; i++) {
            students[i].displayInfo();
        }

        // 평균 점수 계산
        double average = calculateAverage(students, count);
        System.out.printf("\n평균 점수: %.2f\n", average);
    }

    // 평균 점수를 계산하는 메소드
    private static double calculateAverage(Student[] students, int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += students[i].getScore();
        }
        return (double) total / count;
    }
}

