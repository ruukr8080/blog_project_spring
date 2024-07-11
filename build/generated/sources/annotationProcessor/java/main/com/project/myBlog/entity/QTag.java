package com.project.myBlog.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTag is a Querydsl query type for Tag
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTag extends EntityPathBase<Tag> {

    private static final long serialVersionUID = 1937315757L;

    public static final QTag tag = new QTag("tag");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<PostTag, QPostTag> postTagList = this.<PostTag, QPostTag>createList("postTagList", PostTag.class, QPostTag.class, PathInits.DIRECT2);

    public final StringPath tagName = createString("tagName");

    public QTag(String variable) {
        super(Tag.class, forVariable(variable));
    }

    public QTag(Path<? extends Tag> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTag(PathMetadata metadata) {
        super(Tag.class, metadata);
    }

}

