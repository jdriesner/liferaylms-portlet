/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.lms.service.base;

import com.liferay.lms.service.CourseResultLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 */
public class CourseResultLocalServiceClpInvoker {
	public CourseResultLocalServiceClpInvoker() {
		_methodName0 = "addCourseResult";

		_methodParameterTypes0 = new String[] {
				"com.liferay.lms.model.CourseResult"
			};

		_methodName1 = "createCourseResult";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteCourseResult";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteCourseResult";

		_methodParameterTypes3 = new String[] {
				"com.liferay.lms.model.CourseResult"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "fetchCourseResult";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "getCourseResult";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getPersistedModel";

		_methodParameterTypes11 = new String[] { "java.io.Serializable" };

		_methodName12 = "getCourseResults";

		_methodParameterTypes12 = new String[] { "int", "int" };

		_methodName13 = "getCourseResultsCount";

		_methodParameterTypes13 = new String[] {  };

		_methodName14 = "updateCourseResult";

		_methodParameterTypes14 = new String[] {
				"com.liferay.lms.model.CourseResult"
			};

		_methodName15 = "updateCourseResult";

		_methodParameterTypes15 = new String[] {
				"com.liferay.lms.model.CourseResult", "boolean"
			};

		_methodName158 = "getBeanIdentifier";

		_methodParameterTypes158 = new String[] {  };

		_methodName159 = "setBeanIdentifier";

		_methodParameterTypes159 = new String[] { "java.lang.String" };

		_methodName164 = "getByUserId";

		_methodParameterTypes164 = new String[] { "long" };

		_methodName165 = "getByUserAndCourse";

		_methodParameterTypes165 = new String[] { "long", "long" };

		_methodName166 = "countByCourseId";

		_methodParameterTypes166 = new String[] { "long", "boolean" };

		_methodName167 = "countByUserId";

		_methodParameterTypes167 = new String[] { "long" };

		_methodName168 = "countStudentsByCourseId";

		_methodParameterTypes168 = new String[] {
				"com.liferay.lms.model.Course", "boolean"
			};

		_methodName169 = "countStudentsByCourseId";

		_methodParameterTypes169 = new String[] {
				"com.liferay.lms.model.Course", "java.util.List", "boolean"
			};

		_methodName170 = "countStudentsByCourseIdUserExcludedIds";

		_methodParameterTypes170 = new String[] { "long", "long[][]", "boolean" };

		_methodName171 = "countStudentsByCourseId";

		_methodParameterTypes171 = new String[] { "com.liferay.lms.model.Course" };

		_methodName172 = "countStudentsByCourseId";

		_methodParameterTypes172 = new String[] {
				"com.liferay.lms.model.Course", "java.util.List"
			};

		_methodName173 = "countStudentsByCourseIdUserExcludedIdsStarted";

		_methodParameterTypes173 = new String[] { "long", "long[][]" };

		_methodName174 = "countStudentsByCourseIdUserExcludedIdsFinished";

		_methodParameterTypes174 = new String[] { "long", "long[][]" };

		_methodName175 = "countStudentsByCourseIdUserExcludedIdsPassed";

		_methodParameterTypes175 = new String[] { "long", "long[][]" };

		_methodName176 = "countStudentsByCourseIdUserExcludedIdsFailed";

		_methodParameterTypes176 = new String[] { "long", "long[][]" };

		_methodName177 = "countStudentsByCourseIdUserIdsStarted";

		_methodParameterTypes177 = new String[] { "long", "long[][]" };

		_methodName178 = "countStudentsByCourseIdUserIdsFinished";

		_methodParameterTypes178 = new String[] { "long", "long[][]" };

		_methodName179 = "countStudentsByCourseIdUserIdsPassed";

		_methodParameterTypes179 = new String[] { "long", "long[][]" };

		_methodName180 = "countStudentsByCourseIdUserIdsFailed";

		_methodParameterTypes180 = new String[] { "long", "long[][]" };

		_methodName181 = "avgResult";

		_methodParameterTypes181 = new String[] { "long", "boolean" };

		_methodName182 = "avgResult";

		_methodParameterTypes182 = new String[] { "long" };

		_methodName183 = "avgStudentsResult";

		_methodParameterTypes183 = new String[] {
				"com.liferay.lms.model.Course", "boolean"
			};

		_methodName184 = "avgStudentsResult";

		_methodParameterTypes184 = new String[] {
				"com.liferay.lms.model.Course", "java.util.List", "boolean"
			};

		_methodName185 = "avgResultByCourseIdUserExcludedIds";

		_methodParameterTypes185 = new String[] { "long", "boolean", "long[][]" };

		_methodName186 = "create";

		_methodParameterTypes186 = new String[] { "long", "long" };

		_methodName187 = "create";

		_methodParameterTypes187 = new String[] {
				"long", "long", "java.util.Date", "java.util.Date"
			};

		_methodName188 = "update";

		_methodParameterTypes188 = new String[] {
				"com.liferay.lms.model.CourseResult"
			};

		_methodName189 = "update";

		_methodParameterTypes189 = new String[] {
				"com.liferay.lms.model.ModuleResult"
			};

		_methodName190 = "getCourseResultByCourseAndUser";

		_methodParameterTypes190 = new String[] { "long", "long" };

		_methodName191 = "translateResult";

		_methodParameterTypes191 = new String[] {
				"java.util.Locale", "double", "long"
			};

		_methodName192 = "softInitializeByGroupIdAndUserId";

		_methodParameterTypes192 = new String[] { "long", "long" };

		_methodName193 = "resetUser";

		_methodParameterTypes193 = new String[] { "long", "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return CourseResultLocalServiceUtil.addCourseResult((com.liferay.lms.model.CourseResult)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return CourseResultLocalServiceUtil.createCourseResult(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return CourseResultLocalServiceUtil.deleteCourseResult(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return CourseResultLocalServiceUtil.deleteCourseResult((com.liferay.lms.model.CourseResult)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return CourseResultLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return CourseResultLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return CourseResultLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return CourseResultLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return CourseResultLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return CourseResultLocalServiceUtil.fetchCourseResult(((Long)arguments[0]).longValue());
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return CourseResultLocalServiceUtil.getCourseResult(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return CourseResultLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return CourseResultLocalServiceUtil.getCourseResults(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return CourseResultLocalServiceUtil.getCourseResultsCount();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return CourseResultLocalServiceUtil.updateCourseResult((com.liferay.lms.model.CourseResult)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return CourseResultLocalServiceUtil.updateCourseResult((com.liferay.lms.model.CourseResult)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName158.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes158, parameterTypes)) {
			return CourseResultLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName159.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes159, parameterTypes)) {
			CourseResultLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);
		}

		if (_methodName164.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes164, parameterTypes)) {
			return CourseResultLocalServiceUtil.getByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName165.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes165, parameterTypes)) {
			return CourseResultLocalServiceUtil.getByUserAndCourse(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName166.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes166, parameterTypes)) {
			return CourseResultLocalServiceUtil.countByCourseId(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName167.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes167, parameterTypes)) {
			return CourseResultLocalServiceUtil.countByUserId(((Long)arguments[0]).longValue());
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseId((com.liferay.lms.model.Course)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseId((com.liferay.lms.model.Course)arguments[0],
				(java.util.List<com.liferay.portal.model.User>)arguments[1],
				((Boolean)arguments[2]).booleanValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserExcludedIds(((Long)arguments[0]).longValue(),
				(long[])arguments[1], ((Boolean)arguments[2]).booleanValue());
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseId((com.liferay.lms.model.Course)arguments[0]);
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseId((com.liferay.lms.model.Course)arguments[0],
				(java.util.List<com.liferay.portal.model.User>)arguments[1]);
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserExcludedIdsStarted(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserExcludedIdsFinished(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserExcludedIdsPassed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserExcludedIdsFailed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserIdsStarted(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserIdsFinished(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserIdsPassed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return CourseResultLocalServiceUtil.countStudentsByCourseIdUserIdsFailed(((Long)arguments[0]).longValue(),
				(long[])arguments[1]);
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return CourseResultLocalServiceUtil.avgResult(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return CourseResultLocalServiceUtil.avgResult(((Long)arguments[0]).longValue());
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return CourseResultLocalServiceUtil.avgStudentsResult((com.liferay.lms.model.Course)arguments[0],
				((Boolean)arguments[1]).booleanValue());
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return CourseResultLocalServiceUtil.avgStudentsResult((com.liferay.lms.model.Course)arguments[0],
				(java.util.List<com.liferay.portal.model.User>)arguments[1],
				((Boolean)arguments[2]).booleanValue());
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return CourseResultLocalServiceUtil.avgResultByCourseIdUserExcludedIds(((Long)arguments[0]).longValue(),
				((Boolean)arguments[1]).booleanValue(), (long[])arguments[2]);
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return CourseResultLocalServiceUtil.create(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return CourseResultLocalServiceUtil.create(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.util.Date)arguments[2],
				(java.util.Date)arguments[3]);
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			CourseResultLocalServiceUtil.update((com.liferay.lms.model.CourseResult)arguments[0]);
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			CourseResultLocalServiceUtil.update((com.liferay.lms.model.ModuleResult)arguments[0]);
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return CourseResultLocalServiceUtil.getCourseResultByCourseAndUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return CourseResultLocalServiceUtil.translateResult((java.util.Locale)arguments[0],
				((Double)arguments[1]).doubleValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName192.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes192, parameterTypes)) {
			CourseResultLocalServiceUtil.softInitializeByGroupIdAndUserId(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName193.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes193, parameterTypes)) {
			CourseResultLocalServiceUtil.resetUser(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName158;
	private String[] _methodParameterTypes158;
	private String _methodName159;
	private String[] _methodParameterTypes159;
	private String _methodName164;
	private String[] _methodParameterTypes164;
	private String _methodName165;
	private String[] _methodParameterTypes165;
	private String _methodName166;
	private String[] _methodParameterTypes166;
	private String _methodName167;
	private String[] _methodParameterTypes167;
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName173;
	private String[] _methodParameterTypes173;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName177;
	private String[] _methodParameterTypes177;
	private String _methodName178;
	private String[] _methodParameterTypes178;
	private String _methodName179;
	private String[] _methodParameterTypes179;
	private String _methodName180;
	private String[] _methodParameterTypes180;
	private String _methodName181;
	private String[] _methodParameterTypes181;
	private String _methodName182;
	private String[] _methodParameterTypes182;
	private String _methodName183;
	private String[] _methodParameterTypes183;
	private String _methodName184;
	private String[] _methodParameterTypes184;
	private String _methodName185;
	private String[] _methodParameterTypes185;
	private String _methodName186;
	private String[] _methodParameterTypes186;
	private String _methodName187;
	private String[] _methodParameterTypes187;
	private String _methodName188;
	private String[] _methodParameterTypes188;
	private String _methodName189;
	private String[] _methodParameterTypes189;
	private String _methodName190;
	private String[] _methodParameterTypes190;
	private String _methodName191;
	private String[] _methodParameterTypes191;
	private String _methodName192;
	private String[] _methodParameterTypes192;
	private String _methodName193;
	private String[] _methodParameterTypes193;
}