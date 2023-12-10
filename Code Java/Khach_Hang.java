/***********************************************************************
 * Module:  Khach_Hang.java
 * Author:  Neymar JR
 * Purpose: Defines the Class Khach_Hang
 ***********************************************************************/

import java.util.*;

/** @pdOid b5029e52-2f75-4bea-8ece-bdbbece211ed */
public class Khach_Hang {
   /** @pdOid 23b67bb3-d319-4479-a90a-c98d420fe364 */
   private String MaKhachHang;
   /** @pdOid ac176bd8-0ab0-4def-9507-a771b026d046 */
   private String TenKhachHang;
   /** @pdOid 83a57cf9-68b2-4503-8d55-56676764d51a */
   private String DiaChi;
   /** @pdOid 90be9b63-7ce8-4fec-8ea3-0906d2cd1068 */
   private int SDT;
   
   /** @pdRoleInfo migr=no name=HoaDon assc=Association_2 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<HoaDon> hoaDon;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<HoaDon> getHoaDon() {
      if (hoaDon == null)
         hoaDon = new java.util.HashSet<HoaDon>();
      return hoaDon;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorHoaDon() {
      if (hoaDon == null)
         hoaDon = new java.util.HashSet<HoaDon>();
      return hoaDon.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newHoaDon */
   public void setHoaDon(java.util.Collection<HoaDon> newHoaDon) {
      removeAllHoaDon();
      for (java.util.Iterator iter = newHoaDon.iterator(); iter.hasNext();)
         addHoaDon((HoaDon)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newHoaDon */
   public void addHoaDon(HoaDon newHoaDon) {
      if (newHoaDon == null)
         return;
      if (this.hoaDon == null)
         this.hoaDon = new java.util.HashSet<HoaDon>();
      if (!this.hoaDon.contains(newHoaDon))
         this.hoaDon.add(newHoaDon);
   }
   
   /** @pdGenerated default remove
     * @param oldHoaDon */
   public void removeHoaDon(HoaDon oldHoaDon) {
      if (oldHoaDon == null)
         return;
      if (this.hoaDon != null)
         if (this.hoaDon.contains(oldHoaDon))
            this.hoaDon.remove(oldHoaDon);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllHoaDon() {
      if (hoaDon != null)
         hoaDon.clear();
   }

}