package cn.exjoy.study.ibatis;

import java.io.Reader;
import java.math.BigDecimal;
import java.util.Date;

import cn.exjoy.study.ibatis.dataobject.Order;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class TestiBatis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SqlMapClient sqlMap = null;
		try {
			String resource = "META-INF/SqlMapConfig.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);

			sqlMap.startTransaction();

			Order order = new Order();
			order.setCreateTime(new Date());
			order.setCustomerId(1);
			order.setModifyTime(new Date());
			order.setOrderNo("ffffff");
			order.setOrderTime(new Date());
			order.setPayDate(new Date());
			order.setShipAddress("dddddd");
			order.setTotalAmount(new BigDecimal("11.11"));

			// sqlMap.insert("INSERT-ORDER", order);

			// List<Order> orders =
			// (List<Order>)sqlMap.queryForList("LOAD-BY-ID-LOCKED", 2);
			Order orders = (Order) sqlMap
					.queryForObject("LOAD-BY-ID-LOCKED", 2);

			sqlMap.commitTransaction();

			System.out.println(orders);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		} finally {

			try {
				if (sqlMap != null)
					sqlMap.endTransaction();
			} catch (Exception e1) {
			}
		}

	}
}
