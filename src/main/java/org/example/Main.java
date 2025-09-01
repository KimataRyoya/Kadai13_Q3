package org.example;

import java.util.Scanner;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("携帯電話番号を入力してください:");
    String telephoneNumber = scanner.nextLine(); 

    if (telephoneNumber.matches("^(070|080|090)-\\d{4}-\\d{4}$")) {
      System.out.println(telephoneNumber + "は有効な携帯電話番号です。");
    } else {
      System.out.println(telephoneNumber + "は無効な携帯電話番号です。");
    }
  }
}

