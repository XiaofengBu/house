package com.xiaofeng.house.biz.mapper;

import com.xiaofeng.house.common.model.Blog;
import com.xiaofeng.house.common.page.PageParams;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BlogMapper {

  public List<Blog> selectBlog(@Param("blog") Blog query, @Param("pageParams") PageParams params);

  public Long selectBlogCount(Blog query);

}
