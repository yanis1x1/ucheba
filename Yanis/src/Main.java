import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            {
                System.out.println("Введите 4 числа и программа их посторит от большего к меньшему.");
                System.out.println("Введите 1 число a");
                int a = scanner.nextInt();
                System.out.println("Введите 2 число b");
                int b = scanner.nextInt();
                System.out.println("Введите 3 число c");
                int c = scanner.nextInt();
                System.out.println("Введите 4 число d");
                int d = scanner.nextInt();
                if (a > b & a > c & a > d) {
                    System.out.println("самое большое а " + a);
                    if (b > c & b > d) {
                        System.out.println(" большое b " + b);
                        if (c > d) {
                            System.out.println(" среднее с " + c);
                            System.out.println(" маленькое d " + d);
                        } else if (d > c) {
                            System.out.println("среднее d " + d);
                            System.out.println("маленькое с " + c);
                        }
                    } else if (c > b & c > d) {
                        System.out.println(" Большое с " + c);
                        if (d > b) {
                            System.out.println(" Среднее d " + d);
                            System.out.println("маленькое b " + b);
                        } else if (b > d) {
                            System.out.println("Среднее b " + b);
                            System.out.println("Маленькое d " + d);
                        }
                    } else if (d > b & d > c) {
                        System.out.println("Большое d " + d);
                        if (b > c) {
                            System.out.println("Среднее b " + b);
                            System.out.println("Маленькое c " + c);
                        } else if (c > b) {
                            System.out.println("Среднее с " + c);
                            System.out.println("Маленькое d " + d);
                        }
                    }
                } else if (b > a & b > c & b > d) {
                    System.out.println("Самое большое b " + b);
                    if (a > c & a > d) {
                        System.out.println("Большое а " + a);
                        if (c > d) {
                            System.out.println("Среднее с " + c);
                            System.out.println("Маленькое d " + d);
                        } else if (d > c) {
                            System.out.println("Средее d " + d);
                            System.out.println("Маленькое с " + c);
                        }
                    } else if (c > a & c > d) {
                        System.out.println("Большое с " + c);
                        if (d > a) {
                            System.out.println("среднее d" + d);
                            System.out.println("Маленькое а" + a);
                        } else if (a > d) {
                            System.out.println("Среднее а " + a);
                            System.out.println("Маленькое d " + d);
                        }
                    } else if (d > a & d > c) {
                        System.out.println("Большое d " + d);
                        if (a > c) {
                            System.out.println("Среднее а " + a);
                            System.out.println("Маленькое с " + c);
                        } else if (c > a) {
                            System.out.println("Среднее с " + c);
                            System.out.println("Маленькое а " + a);
                        }
                    }
                } else if (c > a & c > b & c > d) {
                    System.out.println("Самое большое с " + c);
                    if (a > b & a > d) {
                        System.out.println("Большое а " + a);
                        if (b > d) {
                            System.out.println("Среднее b " + b);
                            System.out.println("Маленькое d " + d);
                        } else if (d > b) {
                            System.out.println("Среднее d " + d);
                            System.out.println("Маленькое b " + b);
                        }
                    } else if (b > a & b > d) {
                        System.out.println("Большая b " + b);
                        if (a > c) {
                            System.out.println("Средняя а" + a);
                            System.out.println("Маленькая с" + c);
                        } else if (c > a) {
                            System.out.println("Средняя c " + c);
                            System.out.println("Маленькое а " + a);
                        }
                    } else if (d > a & d > b) {
                        System.out.println("Большая d " + d);
                        if (a > b) {
                            System.out.println("Средняя а " + a);
                            System.out.println("Маленькая b " + b);
                        } else if (b > a) {
                            System.out.println("Средняя b " + b);
                            System.out.println("Маленькая а" + a);
                        }
                    }
                } else if (d > a & d > b & d > c) {
                    System.out.println("Самая большая d " + d);
                    if (a > b & a > c) {
                        System.out.println("Большая а " + a);
                        if (b > c) {
                            System.out.println("Средня b " + b);
                            System.out.println("Маленькая с " + c);
                        } else if (c > b) {
                            System.out.println("Средняя с " + c);
                            System.out.println("Маленькая d " + d);
                        }
                    } else if (b > a & b > c) {
                        System.out.println("Большая b " + b);
                        if (a > c) {
                            System.out.println("Средняя а " + a);
                            System.out.println("Маленькая с " + c);
                        } else if (c > a) {
                            System.out.println("Средняя с " + c);
                            System.out.println("Маленькая а " + a);
                        }
                    } else if (c > a & c > b) {
                        System.out.println("Большая с " + c);
                        if (a > b) {
                            System.out.println("Средняя а " + a);
                            System.out.println("Маленькая b " + b);
                        } else if (b > a) {
                            System.out.println("Средняя b " + b);
                            System.out.println(" Маленькая а " + a);
                        }
                    }
                }
            }
        }
    }
}