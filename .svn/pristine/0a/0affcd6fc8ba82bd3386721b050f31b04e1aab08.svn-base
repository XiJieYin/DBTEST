package com.gx.hz.dao;

import com.gx.hz.pojo.Tmtplrwz;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by ten on 17/12/22.
 */
public interface TmtplrwzDao  extends BaseDao<Tmtplrwz> {
    int deleteByPrimaryKey(Long id);

    int insert(Tmtplrwz record);

    int insertSelective(Tmtplrwz record);

    Tmtplrwz selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Tmtplrwz record);

    int updateByPrimaryKey(Tmtplrwz record);

    List<Tmtplrwz> selectByJZID(Long jzId) ;
    List<Tmtplrwz> selectByJZIDAndUserId(@Param("jzId")Long jzId,@Param("userId")Long userId) ;

    List<Tmtplrwz> selectByJZBH(String jzbh) ;

}
