package hayaa.database.center.dao;

import hayaa.database.center.model.DataConnectionString;
import hayaa.database.center.model.DataconnectionstringExample;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 说明：
 * 版权所有。
 *
 * @version 1.0 17-9-29 下午4:24 by谢青靖（xieqj@cloud-young.com）创建
 */
@Repository
public interface DataconnectionstringMapper  extends BaseMapper<DataConnectionString,DataconnectionstringExample> {
    List<DataConnectionString> searchDataConnectionString(String connection, String databaseType,
                                                          String title, int isActive);
}
