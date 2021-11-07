package ru.netology.domain.VK;

public class VkPost {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private int singerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private Donut donut;
    private Geo geo;
    private LikesInfo likesInfo;
    private Place place;
    private Placeholder placeholder;
    private PostSource postSource;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

    // + get/set на все поля
}
