/***********************************************************************
 * Module:  SanPham.java
 * Author:  Neymar JR
 * Purpose: Defines the Class SanPham
 ***********************************************************************/

import java.util.*;

/** @pdOid d2cc18eb-2233-408f-b29f-ffbf41cc98db */
public class SanPham {
   /** @pdOid bdd8fe9c-65c4-4f74-bc48-4fc0f7eb7ac1 */
   private String MaSanPham;
   /** @pdOid eadb5c5b-c97c-4d32-949e-0b249d46eb65 */
   private String TenSanPham;
   /** @pdOid aa98b6bd-8c2e-4a5f-9580-ae34158395a9 */
   private String Loai;
   /** @pdOid 277c7609-8b52-4240-8577-00fdf12c5945 */
   private String XuatSu;
   /** @pdOid 81503a9b-2fd2-45c3-9fb9-eb9b3e7b68d4 */
   private double GiaBan;
   /** @pdOid 9e38f3ca-c4b5-4f4c-9f0e-c3dc505c948c */
   private String DonViTinh;
   
   /** @pdRoleInfo migr=no name=HoaDon assc=Association_3 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
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