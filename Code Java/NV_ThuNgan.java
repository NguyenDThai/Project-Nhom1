/***********************************************************************
 * Module:  NV_ThuNgan.java
 * Author:  Neymar JR
 * Purpose: Defines the Class NV_ThuNgan
 ***********************************************************************/

import java.util.*;

/** @pdOid dc69f95e-68b9-4b81-b971-ac726a1861c9 */
public class NV_ThuNgan extends NhanVien {
   /** @pdOid 39593dd9-0217-4ca8-b71d-b1be03b019e7 */
   private double Luong;
   
   /** @pdRoleInfo migr=no name=HoaDon assc=Association_1 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
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