package com.xf.docman.front.utils;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 *
 */
public interface PageUtils {

    static void setPage(Page page, Integer currentPage, Integer pageSize) {
        if (currentPage == null || currentPage < 1) {
            currentPage = 1;
        }
        if (pageSize == null || pageSize < 1) {
            pageSize = 10;
        }
        page.setCurrent(currentPage);
        page.setSize(pageSize);
    }

    static void restSize(Page page) {
        if (page.getSize() < 1) {
            page.setSize(10);
        }
    }

    static <T> Page<T> emptyPage() {
        Page<T> page = new Page<>();
        return page;
    }

    static int reCalcCurrentPage(Integer currentPage) {
        if (currentPage == null || currentPage < 1) {
            return 1;
        }
        return currentPage;
    }


    static int reCalcPageSize(Integer pageSize) {
        if (pageSize == null || pageSize < 1 || pageSize > 1000) {
            return 10;
        }
        return pageSize;
    }
}