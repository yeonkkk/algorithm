SELECT
    ID,
    (
        SELECT COUNT(B.PARENT_ID)
        FROM ECOLI_DATA AS B
        WHERE B.PARENT_ID IS NOT NULL AND B.PARENT_ID = A.ID
    ) AS CHILD_COUNT
FROM ECOLI_DATA AS A
;
