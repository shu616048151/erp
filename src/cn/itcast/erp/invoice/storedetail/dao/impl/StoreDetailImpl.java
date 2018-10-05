package cn.itcast.erp.invoice.storedetail.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import cn.itcast.erp.invoice.storedetail.dao.dao.StoreDetailDao;
import cn.itcast.erp.invoice.storedetail.vo.StoreDetailModel;
import cn.itcast.erp.invoice.storedetail.vo.StoreDetailQueryModel;
import cn.itcast.erp.util.base.BaseImpl;
import cn.itcast.erp.util.base.BaseQueryModel;

public class StoreDetailImpl extends BaseImpl<StoreDetailModel> implements StoreDetailDao{

	public void doQbc(DetachedCriteria dc,BaseQueryModel qm){
		StoreDetailQueryModel sqm = (StoreDetailQueryModel)qm;
		// TODO 添加自定义查询条件
	}

	public StoreDetailModel getBySmAndGm(Long storeUuid, Long uuid) {
		String hql ="from StoreDetailModel where sm.uuid = ? and gm.uuid= ?";
		List<StoreDetailModel> temp = this.getHibernateTemplate().find(hql,storeUuid,uuid);
		return temp.size()>0 ? temp.get(0):null;
	}

}
