package track;

public abstract class Track {

  // AF
  // ������������źͰ뾶
  // RI
  // n��r����ֵ
  // Safety from rep exposure:
  // all the fields are private�������ǲ��ɱ��
  private final int number;
  private final int radius;

  /**
   * .��ʼ�����
   * 
   * @param n ������
   * @param r ����뾶 �������ԣ�assert�ж�pre-condition�İ뾶�Ƿ���ȷ
   */
  public Track(int n, int r) {
    assert r >= 0;
    this.number = n;
    this.radius = r;
  }

  /**
   * .��ȡ������
   * 
   * @return ������
   */
  public int getN() {
    return number;
  }

  /**
   * .��ȡ����뾶
   * 
   * @return ����뾶
   */
  public int getR() {
    return radius;
  }
}
