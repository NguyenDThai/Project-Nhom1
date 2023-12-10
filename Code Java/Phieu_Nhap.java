/***********************************************************************
 * Module:  Phieu_Nhap.java
 * Author:  Neymar JR
 * Purpose: Defines the Class Phieu_Nhap
 ***********************************************************************/

import java.util.*;

/** @pdOid 0654d470-7f80-4e48-98a8-addf7707d46d */
public class Phieu_Nhap {
   /** @pdOid 7ed3ba77-bc5a-4fa9-90e0-e8787257cfbc */
   private String SoPhieu;
   /** @pdOid 730a524d-03c2-4c3f-b40a-d158c67b3dc7 */
   private Date NgayNhap;
   /** @pdOid 52b654e1-0992-46c1-89b0-5e2f7e523cca */
   private int SoLuong;
   
   /** @pdRoleInfo migr=no name=QuanLy assc=Association_5 coll=java.util.Collection impl=java.util.HashSet mult=1 */
   public QuanLy quanLy;
   /** @pdRoleInfo migr=no name=SanPham assc=Association_7 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<SanPham> sanPham;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<SanPham> getSanPham() {
      if (sanPham == null)
         sanPham = new java.util.HashSet<SanPham>();
      return sanPham;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSanPham() {
      if (sanPham == null)
         sanPham = new java.util.HashSet<SanPham>();
      return sanPham.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSanPham */
   public void setSanPham(java.util.Collection<SanPham> newSanPham) {
      removeAllSanPham();
      for (java.util.Iterator iter = newSanPham.iterator(); iter.hasNext();)
         addSanPham((SanPham)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSanPham */
   public void addSanPham(SanPham newSanPham) {
      if (newSanPham == null)
         return;
      if (this.sanPham == null)
         this.sanPham = new java.util.HashSet<SanPham>();
      if (!this.sanPham.contains(newSanPham))
         this.sanPham.add(newSanPham);
   }
   
   /** @pdGenerated default remove
     * @param oldSanPham */
   public void removeSanPham(SanPham oldSanPham) {
      if (oldSanPham == null)
         return;
      if (this.sanPham != null)
         if (this.sanPham.contains(oldSanPham))
            this.sanPham.remove(oldSanPham);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSanPham() {
      if (sanPham != null)
         sanPham.clear();
   }

}