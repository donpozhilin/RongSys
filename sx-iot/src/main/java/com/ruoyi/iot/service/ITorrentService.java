package com.ruoyi.iot.service;

import com.ruoyi.iot.domain.Torrent;
import java.util.List;

/**
 * 终端运转 服务层
 * 
 * @author 张超
 * @date 2019-03-03
 */
public interface ITorrentService 
{
	/**
     * 查询终端运转信息
     * 
     * @param dataid 终端运转ID
     * @return 终端运转信息
     */
	public Torrent selectTorrentById(Integer dataid);
	
	/**
     * 查询终端运转列表
     * 
     * @param torrent 终端运转信息
     * @return 终端运转集合
     */
	public List<Torrent> selectTorrentList(Torrent torrent);
	
	/**
     * 新增终端运转
     * 
     * @param torrent 终端运转信息
     * @return 结果
     */
	public int insertTorrent(Torrent torrent);
	
	/**
     * 修改终端运转
     * 
     * @param torrent 终端运转信息
     * @return 结果
     */
	public int updateTorrent(Torrent torrent);
		
	/**
     * 删除终端运转信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTorrentByIds(String ids);
	
}