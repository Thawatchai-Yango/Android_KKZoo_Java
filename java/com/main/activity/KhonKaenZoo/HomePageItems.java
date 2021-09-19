package com.main.activity.KhonKaenZoo;
public class HomePageItems {

    private static final String LARGE_BASE_URL = "https://i.ibb.co/";
    private static final String THUMB_BASE_URL = "https://i.ibb.co/";

    public static HomePageItems[] ITEMS = new HomePageItems[] {
            new HomePageItems("หน้าหลัก", "\nยินดีต้อนรับสู่ สวนสัตว์ขอนแก่น", "SNzxCWG/main-menu.png"),
            new HomePageItems("สถานที่แนะนำ", "", "vcxJFZz/Rec-PLace-Bg.jpg"),
            new HomePageItems("รอบการแสดง", "", "r0pts2T/DCIM-100-GOPRO-GOPR1424-JPG.jpg"),
            new HomePageItems("จองบัตรสวนสัตว์", "", "Nj2RXFB/ticket.jpg"),
            new HomePageItems("สัตว์เลี้ยงลูกด้วยนม", "", "nPYsC8K/mammal-logo.webp"),
            new HomePageItems("สัตว์เลื้อยคลาน", "", "NWgVZb0/reptile-main.jpg"),
            new HomePageItems("สัตว์ปีก", "", "XpXd4xg/poultry.webp"),
            new HomePageItems("สัตว์น้ำ", "", "n7xQDRQ/aquatic-bg.jpg"),
            new HomePageItems("สัตว์สะเทินน้ำสะเทินบก", "", "Lz98Xk1/amphibians-bg.jpg"),
            new HomePageItems("สัตว์ไม่มีกระดูกสันหลัง", "", "JcP3g8n/invert-bg.jpg"),
            new HomePageItems("คลังภาพ", "", "JkLhR8k/photo-bar.jpg"),
            new HomePageItems("คลังวิดีโอ", "", "SXKNRtZ/video-bar.jpg"),
            new HomePageItems("หนังสือ (E-BOOK)", "", "FBN7CXg/ebook-bar.jpg"),
            new HomePageItems("เกี่ยวกับเรา", "", "fq9bGRk/info-bar.jpg"),
            new HomePageItems("ผู้จัดทำ", "", "7VB5npf/dev-bar.jpg"),
    };

    public static HomePageItems getItem(int id) {
        for (HomePageItems item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    private final String mName;
    private final String mExtendName;
    private final String mFileName;

    HomePageItems(String name, String author, String fileName) {
        mName = name;
        mExtendName = author;
        mFileName = fileName;
    }

    public int getId() {
        return mName.hashCode() + mFileName.hashCode();
    }

    public String getAuthor() {
        return mExtendName;
    }

    public String getName() {
        return mName;
    }

    public String getPhotoUrl() {
        return LARGE_BASE_URL + mFileName;
    }

    public String getThumbnailUrl() {
        return THUMB_BASE_URL + mFileName;
    }

}
