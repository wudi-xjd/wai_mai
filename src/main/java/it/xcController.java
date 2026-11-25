package it;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class xcController {
    @Resource
    private xcService xcService;


    @GetMapping("/orders")
    public Result<PageResult> page(@RequestParam(defaultValue = "1") int page,
                                   @RequestParam(defaultValue = "10") int size){
        pageDTO dto = new pageDTO();
        dto.setPage(page);
        dto.setPageSize(size);
        return Result.success(xcService.pageOrder(dto));
    }
}
