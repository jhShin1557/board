package com.example.board.repository;

import com.example.board.domain.BoardDto;
import com.example.board.domain.SearchCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BoardDaoImpl implements BoardDao {

    private final BoardDao boardDao;

    @Autowired
    public BoardDaoImpl(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public int count() {
        return boardDao.count();
    }

    @Override
    public int deleteAll() {
        return boardDao.deleteAll();
    }

    @Override
    public int delete(Integer bno) {
        return boardDao.delete(bno);
    }

    @Override
    public int insert(BoardDto dto) {
        return boardDao.insert(dto);
    }

    @Override
    public List<BoardDto> selectAll() {
        return boardDao.selectAll();
    }

    @Override
    public BoardDto select(Integer bno) {
        return boardDao.select(bno);
    }

    @Override
    public List<BoardDto> selectPage(Map map) {
        return boardDao.selectPage(map);
    }

    @Override
    public int update(BoardDto dto) {
       return boardDao.update(dto);
    }

    @Override
    public int increaseViewCnt(Integer bno) {
        return boardDao.increaseViewCnt(bno);
    }

    @Override
    public List<BoardDto> searchSelectPage(SearchCondition sc) {
        return boardDao.searchSelectPage(sc);
    }

    @Override
    public int searchResultCnt(SearchCondition sc) {
        return boardDao.searchResultCnt(sc);
    }

    @Override
    public int updateCommentCnt(Integer bno, int cnt) {
        return boardDao.updateCommentCnt(bno, cnt);
    }


}
