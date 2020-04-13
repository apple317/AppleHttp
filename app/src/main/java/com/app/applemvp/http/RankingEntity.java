package com.app.applemvp.http;

import java.io.Serializable;

public class RankingEntity implements Serializable {

    /**
     * country : 内地
     * piao_id : 0
     * res_encryption_flag : 0
     * mv_provider : 0000000000
     * biaoshi : lossless,vip,perm-1
     * artist_name : 佟丽娅,蔡徐坤
     * is_first_publish : 0
     * language : 国语
     * album_1000_1000 : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_1000,h_1000
     * korean_bb_song : 0
     * pic_huge : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_1000,h_1000
     * all_rate : 96,224,128,320,flac
     * song_source : web
     * song_id : 675012544
     * album_500_500 : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_500,h_500
     * rank : 1
     * pic_premium : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_500,h_500
     * album_800_800 :
     * info :
     * area : 0
     * si_proxycompany : 永稻星（北京）文化娱乐有限公司
     * has_mv_mobile : 0
     * is_new : 1
     * author : 佟丽娅,蔡徐坤
     * resource_type : 0
     * has_filmtv : 0
     * all_artist_ting_uid : 9631389,239563102
     * artist_id : 14715949
     * versions :
     * publishtime : 2020-03-25
     * style :
     * album_id : 675012542
     * album_no : 1
     * resource_type_ext : 2
     * del_status : 0
     * hot : 19668
     * toneid : 0
     * title : 山河无恙在我胸-蔡徐坤+佟丽娅
     * pic_big : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_150,h_150
     * relate_status : 0
     * rank_change : 0
     * lrclink : http://qukufile2.qianqian.com/data2/lrc/4d34b71f289827f459aadc951b172248/675012957/675012957.txt
     * file_duration : 290
     * havehigh : 2
     * charge : 0
     * pic_radio : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_300,h_300
     * learn : 0
     * pic_s500 : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_500,h_500
     * all_artist_id : 14715949,267237378
     * pic_small : http://qukufile2.qianqian.com/data2/pic/bae766e5c670ca417cc433156efcb528/675012927/675012927.png@s_2,w_90,h_90
     * bitrate_fee : {"0":"129|-1","1":"-1|-1"}
     * has_mv : 0
     * copy_type : 1
     * ting_uid : 9631389
     * album_title : 山河无恙在我胸
     */

    private String country;
    private String piao_id;
    private String res_encryption_flag;
    private String mv_provider;
    private String biaoshi;
    private String artist_name;
    private int is_first_publish;
    private String language;
    private String album_1000_1000;
    private String korean_bb_song;
    private String pic_huge;
    private String all_rate;
    private String song_source;
    private String song_id;
    private String album_500_500;
    private String rank;
    private String pic_premium;
    private String album_800_800;
    private String info;
    private String area;
    private String si_proxycompany;
    private int has_mv_mobile;
    private String is_new;
    private String author;
    private String resource_type;
    private String has_filmtv;
    private String all_artist_ting_uid;
    private String artist_id;
    private String versions;
    private String publishtime;
    private String style;
    private String album_id;
    private String album_no;
    private String resource_type_ext;
    private String del_status;
    private String hot;
    private String toneid;
    private String title;
    private String pic_big;
    private String relate_status;
    private String rank_change;
    private String lrclink;
    private int file_duration;
    private int havehigh;
    private int charge;
    private String pic_radio;
    private int learn;
    private String pic_s500;
    private String all_artist_id;
    private String pic_small;
    private String bitrate_fee;
    private int has_mv;
    private String copy_type;
    private String ting_uid;
    private String album_title;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPiao_id() {
        return piao_id;
    }

    public void setPiao_id(String piao_id) {
        this.piao_id = piao_id;
    }

    public String getRes_encryption_flag() {
        return res_encryption_flag;
    }

    public void setRes_encryption_flag(String res_encryption_flag) {
        this.res_encryption_flag = res_encryption_flag;
    }

    public String getMv_provider() {
        return mv_provider;
    }

    public void setMv_provider(String mv_provider) {
        this.mv_provider = mv_provider;
    }

    public String getBiaoshi() {
        return biaoshi;
    }

    public void setBiaoshi(String biaoshi) {
        this.biaoshi = biaoshi;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public int getIs_first_publish() {
        return is_first_publish;
    }

    public void setIs_first_publish(int is_first_publish) {
        this.is_first_publish = is_first_publish;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAlbum_1000_1000() {
        return album_1000_1000;
    }

    public void setAlbum_1000_1000(String album_1000_1000) {
        this.album_1000_1000 = album_1000_1000;
    }

    public String getKorean_bb_song() {
        return korean_bb_song;
    }

    public void setKorean_bb_song(String korean_bb_song) {
        this.korean_bb_song = korean_bb_song;
    }

    public String getPic_huge() {
        return pic_huge;
    }

    public void setPic_huge(String pic_huge) {
        this.pic_huge = pic_huge;
    }

    public String getAll_rate() {
        return all_rate;
    }

    public void setAll_rate(String all_rate) {
        this.all_rate = all_rate;
    }

    public String getSong_source() {
        return song_source;
    }

    public void setSong_source(String song_source) {
        this.song_source = song_source;
    }

    public String getSong_id() {
        return song_id;
    }

    public void setSong_id(String song_id) {
        this.song_id = song_id;
    }

    public String getAlbum_500_500() {
        return album_500_500;
    }

    public void setAlbum_500_500(String album_500_500) {
        this.album_500_500 = album_500_500;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPic_premium() {
        return pic_premium;
    }

    public void setPic_premium(String pic_premium) {
        this.pic_premium = pic_premium;
    }

    public String getAlbum_800_800() {
        return album_800_800;
    }

    public void setAlbum_800_800(String album_800_800) {
        this.album_800_800 = album_800_800;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSi_proxycompany() {
        return si_proxycompany;
    }

    public void setSi_proxycompany(String si_proxycompany) {
        this.si_proxycompany = si_proxycompany;
    }

    public int getHas_mv_mobile() {
        return has_mv_mobile;
    }

    public void setHas_mv_mobile(int has_mv_mobile) {
        this.has_mv_mobile = has_mv_mobile;
    }

    public String getIs_new() {
        return is_new;
    }

    public void setIs_new(String is_new) {
        this.is_new = is_new;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getHas_filmtv() {
        return has_filmtv;
    }

    public void setHas_filmtv(String has_filmtv) {
        this.has_filmtv = has_filmtv;
    }

    public String getAll_artist_ting_uid() {
        return all_artist_ting_uid;
    }

    public void setAll_artist_ting_uid(String all_artist_ting_uid) {
        this.all_artist_ting_uid = all_artist_ting_uid;
    }

    public String getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(String artist_id) {
        this.artist_id = artist_id;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_no() {
        return album_no;
    }

    public void setAlbum_no(String album_no) {
        this.album_no = album_no;
    }

    public String getResource_type_ext() {
        return resource_type_ext;
    }

    public void setResource_type_ext(String resource_type_ext) {
        this.resource_type_ext = resource_type_ext;
    }

    public String getDel_status() {
        return del_status;
    }

    public void setDel_status(String del_status) {
        this.del_status = del_status;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public String getToneid() {
        return toneid;
    }

    public void setToneid(String toneid) {
        this.toneid = toneid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic_big() {
        return pic_big;
    }

    public void setPic_big(String pic_big) {
        this.pic_big = pic_big;
    }

    public String getRelate_status() {
        return relate_status;
    }

    public void setRelate_status(String relate_status) {
        this.relate_status = relate_status;
    }

    public String getRank_change() {
        return rank_change;
    }

    public void setRank_change(String rank_change) {
        this.rank_change = rank_change;
    }

    public String getLrclink() {
        return lrclink;
    }

    public void setLrclink(String lrclink) {
        this.lrclink = lrclink;
    }

    public int getFile_duration() {
        return file_duration;
    }

    public void setFile_duration(int file_duration) {
        this.file_duration = file_duration;
    }

    public int getHavehigh() {
        return havehigh;
    }

    public void setHavehigh(int havehigh) {
        this.havehigh = havehigh;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getPic_radio() {
        return pic_radio;
    }

    public void setPic_radio(String pic_radio) {
        this.pic_radio = pic_radio;
    }

    public int getLearn() {
        return learn;
    }

    public void setLearn(int learn) {
        this.learn = learn;
    }

    public String getPic_s500() {
        return pic_s500;
    }

    public void setPic_s500(String pic_s500) {
        this.pic_s500 = pic_s500;
    }

    public String getAll_artist_id() {
        return all_artist_id;
    }

    public void setAll_artist_id(String all_artist_id) {
        this.all_artist_id = all_artist_id;
    }

    public String getPic_small() {
        return pic_small;
    }

    public void setPic_small(String pic_small) {
        this.pic_small = pic_small;
    }

    public String getBitrate_fee() {
        return bitrate_fee;
    }

    public void setBitrate_fee(String bitrate_fee) {
        this.bitrate_fee = bitrate_fee;
    }

    public int getHas_mv() {
        return has_mv;
    }

    public void setHas_mv(int has_mv) {
        this.has_mv = has_mv;
    }

    public String getCopy_type() {
        return copy_type;
    }

    public void setCopy_type(String copy_type) {
        this.copy_type = copy_type;
    }

    public String getTing_uid() {
        return ting_uid;
    }

    public void setTing_uid(String ting_uid) {
        this.ting_uid = ting_uid;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public void setAlbum_title(String album_title) {
        this.album_title = album_title;
    }
}
