package applications;

import java.util.Scanner;

public class MainApplications {

  /**
   * .�û���ѡ��Ӧ��
   * 
   * @param args ����Ĳ���
   */
  public static void main(String[] args) {
    System.out.print("��������Ӧ�ã�1.TrackGame 2.AtomStructure 3.PersonalAppEcosystem,���������ѡ��");
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    // in.close();
    if (num == 1) {
      TrackGameApi a1 = new TrackGameApi();
      System.out.println("ѡ���Ӧ��ΪTrackGame");
      boolean c = a1.execute();
      while (!c) {
        c = a1.execute();
      }
    } else if (num == 2) {
      AtomStructureApi a2 = new AtomStructureApi();
      System.out.println("ѡ���Ӧ��ΪAtomStructure");
      boolean c = a2.execute();
      while (!c) {
        c = a2.execute();
      }
    } else if (num == 3) {
      PersonalAppEcosystemApi a3 = new PersonalAppEcosystemApi();
      System.out.println("ѡ���Ӧ��ΪPersonalAppEcosystem");
      boolean c = a3.execute();
      while (!c) {
        c = a3.execute();
      }
    }
  }

}
